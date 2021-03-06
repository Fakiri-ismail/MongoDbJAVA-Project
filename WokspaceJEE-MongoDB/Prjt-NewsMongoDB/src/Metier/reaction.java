package Metier;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class reaction implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private static SimpleDateFormat formatter = new SimpleDateFormat ("yyyy-MM-dd", Locale.FRANCE);
	private static SimpleDateFormat formatter2 = new SimpleDateFormat ("dd-MM-yyyy", Locale.FRANCE);
	
	private int num;
	private String dateReaction; 
	private boolean reaction;
	
	public reaction() {
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getDateReaction() {
		return dateReaction;
	}
	public void setDateReaction(String dateReaction) {
		this.dateReaction = dateReaction;
	}
	public boolean getReaction() {
		return reaction;
	}
	public String  getReaction2() {
		if(reaction) return ("J'aime"); 
		else return ("je Deteste");
	}
	public void setReaction(boolean reaction) {
		this.reaction = reaction;
	}

	@Override
	public String toString() {
		return "Reaction [num=" + num + ", dateReaction=" + dateReaction + ", reaction=" + reaction + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateReaction == null) ? 0 : dateReaction.hashCode());
		result = prime * result + num;
		result = prime * result + (reaction ? 1231 : 1237);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		reaction other = (reaction) obj;
		if (dateReaction == null) {
			if (other.dateReaction != null)
				return false;
		} else if (!dateReaction.equals(other.dateReaction))
			return false;
		if (num != other.num)
			return false;
		if (reaction != other.reaction)
			return false;
		return true;
	}

	

}
