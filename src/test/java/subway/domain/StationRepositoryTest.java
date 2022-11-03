package subway.domain;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import subway.domain.Line;
import subway.domain.LineRepository;
import subway.domain.Station;
import subway.domain.StationRepository;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class StationRepositoryTest {
    @Autowired
    private StationRepository stations;

    @Autowired
    private LineRepository lines;

    @Autowired
    private TestEntityManager manager;


    @Test
    void save() {
        final Station station = new Station("잠실역");
        final Station actual = stations.save(station);
        assertThat(actual.getId()).isNotNull();
        assertThat(actual.getName()).isEqualTo("잠실역");
    }

    @Test
    void findByName() {
        stations.save(new Station("잠실역"));
        final Station actual = stations.findByName("잠실역");
        assertThat(actual).isNotNull();
    }

    @Test
    void identity() {
        final Station station1 = stations.save(new Station("잠실역"));
        final Station station2 = stations.findById(station1.getId()).get();
        assertThat(station1 == station2).isTrue();
    }

    @Test
    void update() {
        final Station station1 = stations.save(new Station("잠실역"));
        station1.changeName("몽촌토성역");
        station1.changeName("잠실역");
        final Station station2 = stations.findByName("잠실역");

        assertThat(station1 == station2).isTrue();
    }

    @Test
    void saveWithLine() {
        final Station station = new Station("잠실역");
        station.setLine(lines.save(new Line("2호선")));
        stations.save(station);
        flushAndClear();
    }

    @Test
    void findByNameWithLine() {
        final Station actual = stations.findByName("교대역");
        assertThat(actual).isNotNull();
        assertThat(actual.getLine()).isNotNull();
    }

    @Test
    void updateWithLine() {
        final Line line = lines.save(new Line("2호선"));
        final Station station = stations.findByName("교대역");
        station.setLine(line);
        flushAndClear();
    }

    @Test
    void removeLine() {
        final Station station = stations.findByName("교대역");
        station.setLine(null);
        flushAndClear();
    }

    @Test
    void deleteLine() {
        final Line line = lines.findById(1L).get();
        lines.delete(line);
        flushAndClear();
    }

    private void flushAndClear() {
        manager.flush();
        manager.clear();
    }
}
