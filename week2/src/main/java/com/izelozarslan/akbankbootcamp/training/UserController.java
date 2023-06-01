package com.izelozarslan.akbankbootcamp.training;


import jakarta.validation.Valid;
import jakarta.validation.constraints.Positive;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

//@RestController
//@Validated
//@RequestMapping("/api/v1/users")
public class UserController {

    @GetMapping
    public ResponseEntity<String> getUsers() {
        String str = "get all users";
        return ResponseEntity.ok(str);
    }

    @GetMapping("/{id}")
    public String getUserById(@PathVariable @Positive Long id) {
        return " get user with id:" + id;
    }

    @PostMapping
    public String saveUser(@RequestBody @Valid UserSaveRequestDTO userSaveRequestDTO) {
        return userSaveRequestDTO + "saved!";
    }

    @PutMapping("/{id}")
    public String updateUser(@PathVariable Long id, @RequestBody UserSaveRequestDTO userSaveRequestDTO) {
        return userSaveRequestDTO + "updated with id: " + id;
    }

    @PutMapping
    public String updateUserWithNameAndSurname(
            @RequestParam String name,@Valid @RequestParam String surname, @RequestBody UserSaveRequestDTO userSaveRequestDTO) {
        return userSaveRequestDTO + "updated with name & surname: " + name + " " + surname;
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Long id) {
        return "user deleted:" + id;
    }

}
