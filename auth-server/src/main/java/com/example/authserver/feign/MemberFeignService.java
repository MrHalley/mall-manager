package com.example.authserver.feign;

import com.example.common.vo.GiteeToken;
import com.example.authserver.vo.UserLoginVo;
import com.example.authserver.vo.UserRegisterVo;
import com.example.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient("mall-member")
public interface MemberFeignService {

    @PostMapping(value = "/member/member/register")
    R register(@RequestBody UserRegisterVo vo);
    @PostMapping(value = "/member/member/login")
    R login(@RequestBody UserLoginVo vo);
    @PostMapping(value = "/member/member/giteeLogin")
    R giteeLogin(@RequestBody GiteeToken giteeToken);
}
