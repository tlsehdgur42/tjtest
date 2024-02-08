package com.oracle.rent.ch08.member;

public class Member {
	String id;
	String password;
	String name;
	String address;
	String phoneNum;

	//	기본생성자
	public Member() {
		
	}

	//	생성자 오버로딩
	public Member(String _id, String _password, String _name, String _address, String _phoneNum) {

		id = _id;
		password = _password;
		name = _name;
		address = _address;
		phoneNum = _phoneNum;
	}
	

	// 새로운 회원 등록 메소드
	public void regMember(String _id, String _password, String _name, String _address, String _phoneNum) {
		System.out.println("회원 가입합니다.");
		id = _id;
		password = _password;
		name = _name;
		address = _address;
		phoneNum = _phoneNum;
	}

	// 기존 회원 정보 조회
	public String viewMemeber() {
		System.out.println("\n회원 정보를 조회합니다.");
		System.out.println("-------------------------");
		String memberInfo = "아이디: " + id 
				           +"\n비밀번호: " + password
				           +"\n이름: " + name 
				           +"\n주소: " + address
				           +"\n전화번호: " +phoneNum;
		return memberInfo;
	}

	// 기존 회원 정보 수정
	public void modMember() {
		System.out.println("\n회원 정보를 수정합니다.");
	}

	//기존 회원 정보 삭제
	public void delMember() {
		System.out.println("\\n회원 정보를 삭제합니다.");
	}

}
