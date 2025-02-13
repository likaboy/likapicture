package com.lika.likapicturebackend.controller;

import com.lika.likapicturebackend.common.BaseResponse;
import com.lika.likapicturebackend.common.ResultUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MainController {
    @RequestMapping("/health")
    public BaseResponse<String> health() {
        return ResultUtils.success("ok");
    }
}
