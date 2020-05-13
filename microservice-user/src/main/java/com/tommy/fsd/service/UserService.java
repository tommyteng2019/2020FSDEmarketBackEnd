package com.tommy.fsd.service;

import com.tommy.fsd.entities.Cart;
import com.tommy.fsd.entities.User;
import com.tommy.fsd.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class UserService {
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    UserRepo userRepo;

    User findOne(String email){
        return userRepo.findByEmail(email);
    };

    Collection<User> findByRole(String role){
        return userRepo.findAllByRole(role);
    };

    User save(User user){
        //register
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        try {
            User savedUser = userRepository.save(user);

            // initial Cart
            Cart savedCart = cartRepository.save(new Cart(savedUser));
            savedUser.setCart(savedCart);
            return userRepository.save(savedUser);

        } catch (Exception e) {
            throw new MyException(ResultEnum.VALID_ERROR);
        }
    };

    User update(User user){
        User oldUser = userRepo.findByEmail(user.getEmail());
        oldUser.setPassword(passwordEncoder.encode(user.getPassword()));
        oldUser.setName(user.getName());
        oldUser.setPhone(user.getPhone());
        oldUser.setAddress(user.getAddress());
        return userRepo.save(oldUser);
    };
}
