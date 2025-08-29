package movieVO;

import java.awt.Color;

//아키텍처가 그리 좋지 않은 상태이다.
public class MovieVO {
	String name;
	int price;
	double score;
	String story;
	String review;// 한줄평 묶음
	String img;
	int total;
	int latestScore;
	String reviewShort;
	int reviewCount;
	String reviewrName;

	public MovieVO(String name, int price, double score, String story, String review, String img) {
		this.name = name;
		this.price = price;
		this.total += score;
		this.story = story;
		this.review = review;
		this.img = img;
		this.reviewCount = 1;
		setScore();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getScore() {
		return score;
	}

	public void setScore() {
		this.score = (double) this.total / this.reviewCount;
	}

	public String getStory() {
		return story;
	}

	public void setStory(String story) {
		this.story = story;
	}

	public String getReview() {
		return review;
	}

//	public void setReview(review) {
	public void setReview() {
		this.review += this.latestScore + "점\t" + this.review + ">\t" + this.reviewShort + "\n";
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public int getTotal() {
		return total;
	}

	// 새로 추가 할 평점을 받아 더함.
	public void setTotal(int newScore) {
		this.total += newScore;
	}

	public int getLatestScore() {
		return latestScore;
	}

	public void setLatestScore(int latestScore) {
		this.latestScore = latestScore;
	}

	public String getReviewShort() {
		return reviewShort;
	}

	public void setReviewShort(String reviewShort) {
		this.reviewShort = reviewShort;
	}

	public int getReviewCount() {
		return reviewCount;
	}

	public void setReviewCount() {
		this.reviewCount++;
	}

	public String getReviewrName() {
		return reviewrName;
	}

	public void setReviewrName(String reviewrName) {
		this.reviewrName = reviewrName;
	}

	@Override
	public String toString() {
		return "★영화 제목 : " + name + "\n★가격 : " + price + "\n★평점 : " + score + "\n★최신 한줄 평 : " + reviewShort;

	}

}