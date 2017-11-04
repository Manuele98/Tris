package MODEL;

public class Persona {
	private String nickname;
	private int vinte;
	
	public Persona (String nickname) {
		this.nickname=nickname;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public int getVinte() {
		return vinte;
	}

	public void setVinte(int vinte) {
		this.vinte = vinte;
	}
	
}
