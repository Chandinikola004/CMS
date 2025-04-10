package application;

public class Addcourse {
	    private int course_id;
		private String course_name;
		private String duration;
		private Long fee;
		private String description;
		public int getCourse_id() {
			return course_id;
		}
		public void setCourse_id(int course_id) {
			this.course_id = course_id;
		}
		
		public String getCourse_name() {
			return course_name;
		}
		public void setCourse_name(String course_name) {
			this.course_name = course_name;
		}
		public String getDuration() {
			return duration;
		}
		public void setDuration(String duration) {
			this.duration = duration;
		}
		public Long getFee() {
			return fee;
		}
		public void setFee(Long fee) {
			this.fee = fee;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		@Override
		public String toString() {
			return "addcourse [course_name=" + course_name + ", duration=" + duration + ", fee=" + fee + ", description="
					+ description + "]";
		}
		public Addcourse(String course_name, String duration, Long fee, String description) {
			super();
			this.course_name = course_name;
			this.duration = duration;
			this.fee = fee;
			this.description = description;
		}
		public Addcourse() {
			super();
			// TODO Auto-generated constructor stub
		}
		
	}