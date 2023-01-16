package com.spring.crud;

public class ArticleVO {

		private String title;
		private String content;
		
		
		public String getTitle() {
			System.out.println("VOgetTitle실행");
			return title;
		}
		public void setTitle(String title) {
			System.out.println("VOsetTitle실행");
			this.title = title;
		}
		public String getContent() {
			System.out.println("VOgetContent실행");
			return content;
		}
		public void setContent(String content) {
			System.out.println("VOsetContent실행");
			this.content = content;
		}
}
