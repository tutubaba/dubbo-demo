package cn.yconnect.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.yconnect.dto.Notice;
import cn.yconnect.service.NoticeService;

@Controller
@RequestMapping("/notice")
public class NoticeAction {

	@Autowired
	private NoticeService noticeService;

	@RequestMapping(value = "/test")
	@ResponseBody
	public Notice getNoticeBean2(Model model) {
		return noticeService.getNotice();
	}
}
