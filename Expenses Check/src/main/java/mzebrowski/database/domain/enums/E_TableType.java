package mzebrowski.database.domain.enums;

public enum E_TableType {
	EXPENSE("Expense"), USER("User");
	
	String name;
	E_TableType(String string)
	{
		this.name = string;
	}
	
	@Override
	public String toString()
	{
		return name;
	}
}
