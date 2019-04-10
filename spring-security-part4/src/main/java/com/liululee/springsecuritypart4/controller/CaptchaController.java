package com.liululee.springsecuritypart4.controller;

import com.liululee.springsecuritypart4.util.ValidateUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.OutputStream;


@RestController
public class CaptchaController {

    /**
     * 用于生成验证码图片
     *
     * @param request
     * @param response
     */
    @GetMapping("/code/image")
    public void createCode(HttpServletRequest request, HttpServletResponse response) throws Exception {
        HttpSession httpSession = request.getSession();
        Object[] objects = ValidateUtil.createImage();
        httpSession.setAttribute("imageCode", objects[0]);
        BufferedImage bufferedImage = (BufferedImage) objects[1];
        response.setContentType("image/png");
        OutputStream os = response.getOutputStream();
        ImageIO.write(bufferedImage, "png", os);
    }
}
