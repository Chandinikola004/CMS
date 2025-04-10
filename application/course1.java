package application;

public class course1 {
	private int course_id1;
	public int getCourse_id1() {
		return course_id1;
	}
	public void setCourse_id1(int course_id1) {
		this.course_id1 = course_id1;
	}
	public String getCourse_name1() {
		return course_name1;
	}
	public void setCourse_name1(String course_name1) {
		this.course_name1 = course_name1;
	}
	public String getDescription1() {
		return description1;
	}
	public void setDescription1(String description1) {
		this.description1 = description1;
	}
	public String getDuration1() {
		return duration1;
	}
	public void setDuration1(String duration1) {
		this.duration1 = duration1;
	}
	public Long getFee1() {
		return fee1;
	}
	public void setFee1(Long fee1) {
		this.fee1 = fee1;
	}
	private String course_name1;
	private String description1;
	private String duration1;
	private Long fee1;
	public course1(int course_id1, String course_name1, String description1, String duration1,
			Long fee1) {
		super();
		this.course_id1 = course_id1;
		this.course_name1 = course_name1;
		this.description1=description1;
		this.duration1= duration1;
		this.fee1= fee1;
	}
	

}
