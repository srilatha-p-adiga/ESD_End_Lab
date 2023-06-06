package JavaLabTest;

public class LabIncharge {
	public String name;
	
	LabIncharge(String name)
	{  this.name=name;
	}
	
	public void installSoft(PC pc,Software sf)
	{ int i;
		for( i=0; i<pc.softList.length && pc.softList[i]!=null;i++);
		pc.softList[i]=sf;
		
	}
	
	public void uninstallSoft(PC pc,String s)
	{ for(int i=0;i<pc.softList.length;i++)
		{ if(pc.softList[i]!=null && pc.softList[i].name.equals(s))
			pc.softList[i]=null;
		}
	}
}
