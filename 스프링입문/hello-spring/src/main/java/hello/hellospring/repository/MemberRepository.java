package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.lang.reflect.Member;
import java.util.List;
import java.util.Optional;

public class MemberRepository {
    Member save(Member member);
    Optional<Member> findById(Long id);
    Optional<Member> findByName(String name);
    List<Member> finalAll();
}
