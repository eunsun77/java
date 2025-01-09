package sub2;

public class book {
	/*
	 * 도서관 관리 시스템의 일부로 Book 클래스를 정의하세요. 이 클래스는 다음 요구사항을 충족해야 합니다.
	 * 
	 * <속성> -title (String) : 책 제목 -author (String): 저자 이름 -isbn (String): ISBN 번호
	 * -availableCopies (int): 이용 가능한 복사본 수
	 * 
	 * <생성자> -모든 인스턴스 변수를 초기화하는 생성자
	 * 
	 * <메서드> borrowBook() -이용 가능한 복사본이 있으면 availableCopies를 1 감소시키고 true를 반환 -이용 가능한
	 * 복사본이 없으면 false를 변환
	 * 
	 * returnBook() -availableCopies를 1 증가
	 * 
	 * show() -모든 멤버 변수 값을 출력
	 * 
	 * <Getter, Setter> -모든 속성에 대한 Getter, Setter 정의
	 */

	private String title;
	private String author;
	private String isbn;
	private int availableCopies;
   
	// 생성자
	public book(String title, String author, String isbn, int availableCopies) {
		super();
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.availableCopies = availableCopies;
	}

	public boolean borrwBook() {
		if (availableCopies > 0) {
			availableCopies--;
			return true;
		} else {
			return false;
		}

	}

	private void returnBook(int availableCopies) {
		availableCopies++;
	}

	public void show() {
		System.out.println("도서명 : " + title);
		System.out.println("작가명 : " + author);
		System.out.println("도서번호: " + isbn);
		System.out.println("도서 복사본 수: " + availableCopies);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
