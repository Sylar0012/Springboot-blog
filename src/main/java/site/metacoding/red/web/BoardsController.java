package site.metacoding.red.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import lombok.RequiredArgsConstructor;
import site.metacoding.red.domain.boards.BoardsDao;
import site.metacoding.red.web.dto.request.boards.DetailDto;
import site.metacoding.red.web.dto.request.boards.MainListDto;
import site.metacoding.red.web.dto.request.boards.WriteDto;

@RequiredArgsConstructor
@Controller
public class BoardsController {

	private final BoardsDao boardsDao;
	
	@GetMapping({"/", "/boards"})
	public String getBoardList(Model model ) {
		List<MainListDto> mainList = boardsDao.findAll();
		model.addAttribute("mainList", mainList);
		return "boards/main";
	}
		
	@GetMapping("/boards/{id}")
	public String getBoardList(@PathVariable Integer id,Model model) {
		DetailDto detailDto = boardsDao.detail(id);
		model.addAttribute("detailDto",detailDto);
		
		return "boards/detail";
	}
	
	@GetMapping("/boards/writeForm")
	public String writeForm() {
		return "/boards/writeForm";
	}
	
	@PostMapping("/write")
	public String write(WriteDto writeDto) {
		boardsDao.insert(writeDto);
		return"redirect:/";
	}
	
	//@PostMapping("/boards/{id}/delete")
	//@PostMapping("/boards/{id}/update")
}















