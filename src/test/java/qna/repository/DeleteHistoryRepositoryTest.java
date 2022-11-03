package qna.repository;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
class DeleteHistoryRepositoryTest {
    @Autowired
    private DeleteHistoryRepository deleteHistoryRepository;

    @DisplayName("삭제 이력을 저장할 수 있다")
    @Test
    void save() {
//        Station expected = new Station("잠실역");
//        Station actual = stations.save(expected);
//        assertAll(
//                () -> assertThat(actual.getId()).isNotNull(),
//                () -> assertThat(actual.getName()).isEqualTo(expected.getName())
//        );
    }
}