package site.metacoding.red.domain.boards;

import java.util.List;

import site.metacoding.red.web.dto.request.boards.DetailDto;
import site.metacoding.red.web.dto.request.boards.MainListDto;
import site.metacoding.red.web.dto.request.boards.WriteDto;

public interface BoardsDao {
	public void insert(WriteDto writeDto); // DTO 생각해보기
	public Boards findById(Integer id);
	public DetailDto detail(Integer id);
	public List<MainListDto> findAll();
	public void update(Boards boards); // DTO 생각해보기
	public void delete(Integer id);
}
