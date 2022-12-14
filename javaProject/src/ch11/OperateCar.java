package ch11;

public interface OperateCar {
	void start();
	void stop();
	void setSpeed(int speed); //매개변수가 있는 추상메소드
	void turn(int degree);

}
