package site.metacoding.red.web.dto.request.boards;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WriteDto {
	
	private Integer usersid;
	private String title;
	private String content;
	
}
