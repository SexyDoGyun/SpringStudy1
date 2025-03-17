package hello.hello_spring.repository;

import hello.hello_spring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);

    Optional<Member> findById(Long id); //findById에서 null을 반환할 수 있기 때문에, Optional을 사용하여 null을 방지한다.

    Optional<Member> findByName(String name);

    List<Member> findAll();
}
