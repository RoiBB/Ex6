package com.roi.todo;


public class Task 
{
	private int id;
	private String description;
	
	public Task() {}
	
	public Task(int id, String description) {
		this.id = id;
		this.description = description;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public boolean equals(Object other)
	{
		if (other == this) 
		{
            return true;
        }
		
        if (other == null || other.getClass() != this.getClass())
        {
            return false;
        }

        Task otherTask = (Task) other;
		
		return otherTask.id == id;
		
		
	}

	@Override
	public String toString() {
		return "Task [id=" + id + ", description=" + description + "]";
	}
	
	
}
