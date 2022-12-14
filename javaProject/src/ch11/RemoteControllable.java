package ch11;

public interface RemoteControllable extends Controllable {
	//인터페이스끼리는 extends로 상속받는다
	void remoteOn();
	void remoteOff();
}
