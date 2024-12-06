package chap1_10.inter.animal;

//Wild 인터페이스와 Huntable인터페이스를 Aggressive(통합)으로 통합하여 두가지 메서드가 필요한 클래스들을 쉽게 불러올 수 있음
public interface Aggressive extends Wild,Huntable{
}
