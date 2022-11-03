package qna.repository;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import qna.domain.Answer;
import qna.domain.User;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;
import static qna.domain.AnswerTest.A1;

@DataJpaTest
class AnswerRepositoryTest {
    @Autowired
    private AnswerRepository answerRepository;

    @DisplayName("답변을 저장할 수 있다")
    @Test
    void save() {
        Answer actual = answerRepository.save(A1);
        assertAll(
                () -> assertThat(actual.getId()).isNotNull(),
                () -> assertThat(actual.isDeleted()).isNotNull()
        );
        System.out.println(actual);
    }

    @DisplayName("id로 조회할 수 있다")
    @Test
    void save1() {

    }

    @DisplayName("답변이 삭제되었을 경우, id로 조회할 수 없다")
    @Test
    void save2() {

    }

    @DisplayName("질문의 id로 조회할 수 있다")
    @Test
    void save4() {

    }

    @DisplayName("답변이 삭제되었을 경우, 질문의 id로 조회할 수 없다")
    @Test
    void save5() {

    }

    @DisplayName("동일성을 보장한다")
    @Test
    void save6() {

    }
}
