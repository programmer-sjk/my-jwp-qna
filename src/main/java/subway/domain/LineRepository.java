package subway.domain;

import org.springframework.data.jpa.repository.JpaRepository;

interface LineRepository extends JpaRepository<Line, Long> {
    Line findByName(String name);
}
