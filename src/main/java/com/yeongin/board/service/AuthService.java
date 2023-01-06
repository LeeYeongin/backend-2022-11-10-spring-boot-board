package com.yeongin.board.service;

import org.springframework.stereotype.Service;

import com.yeongin.board.dto.response.ResponseDto;
import com.yeongin.board.dto.auth.AuthPostDto;
import com.yeongin.board.dto.auth.LoginDto;

// @Service : 해당 클래스가 Service 레이어 역할을 함
@Service
public class AuthService {
	
	public ResponseDto<LoginDto> login(AuthPostDto dto){
		LoginDto result = new LoginDto("JWT", 3600000);
		return ResponseDto.setSuccess("", result);
	}
}
