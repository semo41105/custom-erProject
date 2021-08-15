package customerProject.customer.repository;

import customerProject.customer.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {

    @Query("select m from Member m where m.id = :id and m.pw = :pw")
    Member findUser(@Param("id")String id, @Param("pw")String pw);

}
