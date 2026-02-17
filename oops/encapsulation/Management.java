package encapsulation;

public class Management {
private String title;
private String description;
private  String priority;
private boolean isComplete;
public Management(String title, String description, String priority) {
	super();
	this.title = title;
	this.description = description;
	this.priority = priority;
//	this.isComplete()
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getPriority() {
	return priority;
}
public void setPriority(String priority) {
	this.priority = priority;
}
public boolean isComplete() {
	return isComplete;
}
public void setComplete() {
	if(priority.equals("high")){
		isComplete=false;
	}
	else if(priority.equals("medium")){
		isComplete=true;
	}
}
@Override
public String toString() {
	return "title=" + title + "\n description=" + description + "\n priority=" + priority + "\n isComplete="
			+ isComplete + "";
}



}
