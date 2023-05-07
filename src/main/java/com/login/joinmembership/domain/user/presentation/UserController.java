package com.login.joinmembership.domain.user.presentation;

import com.login.joinmembership.domain.user.dto.UserDto;
import com.login.joinmembership.domain.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/join")
    public String createForm(@RequestBody UserDto dto) {
        return userService.join(dto.getId(), dto.getPw());
    }
}
