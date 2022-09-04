package site.metacoding.red.web.dto.request.boards;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DetailDto {

	private Integer id;
	private String username;
	private String createdAt;
	private String title;
	private String content;
	
}
