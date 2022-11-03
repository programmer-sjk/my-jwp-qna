package qna.repository;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
class QuestionRepositoryTest {
    @Autowired
    private QuestionRepository questionRepository;

    @DisplayName("질문을 저장할 수 있다")
    @Test
    void save() {
//        Station expected = new Station("잠실역");
//        Station actual = stations.save(expected);
//        assertAll(
//                () -> assertThat(actual.getId()).isNotNull(),
//                () -> assertThat(actual.getName()).isEqualTo(expected.getName())
//        );
    }

    @DisplayName("전체 질문을 조회할 수 있다")
    @Test
    void save1() {

    }

    @DisplayName("삭제된 질문은 전체 조회에 검색되지 않는다")
    @Test
    void save2() {

    }

    @DisplayName("id로 조회할 수 있다")
    @Test
    void save4() {

    }

    @DisplayName("삭제된 질문은 id로 조회할 수 없다")
    @Test
    void save5() {

    }

    @DisplayName("동일성을 보장한다")
    @Test
    void save6() {

    }
}