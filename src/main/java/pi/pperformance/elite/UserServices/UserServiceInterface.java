package pi.pperformance.elite.UserServices;

import pi.pperformance.elite.UserRepository.UserRepository;

//the service interface where we're going to declare the function we'll use in both the controller and the service class
public interface UserServiceInterface extends UserRepository{
//please make sure to name the entity "User" so the code recognize it and most of the red underlined User will be gone
    public User addUser(User user);
}
