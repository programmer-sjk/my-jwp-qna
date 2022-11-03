package qna.repository;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;

    @DisplayName("사용자를 저장할 수 있다")
    @Test
    void save() {
//        Station expected = new Station("잠실역");
//        Station actual = stations.save(expected);
//        assertAll(
//                () -> assertThat(actual.getId()).isNotNull(),
//                () -> assertThat(actual.getName()).isEqualTo(expected.getName())
//        );
    }

    @DisplayName("사용자 계정으로 조회할 수 있다")
    @Test
    void save1() {

    }
}