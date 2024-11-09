package pi.pperformance.elite.UserRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pi.pperformance.elite.entities.User;

//the repository interface, it doesn't contain any function they're all comming from the interface "JPARepository" , we'll add others if we needed
@Repository
//please make sure to name the entity "User" so the code recognize it and most of the red underlined User will be gone
public interface UserRepository extends JpaRepository<User, Long> {

}
