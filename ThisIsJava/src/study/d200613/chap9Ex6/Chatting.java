package study.d200613.chap9Ex6;

public class Chatting {
	void startChat(String chatId) {
		String nickName = chatId;
//		nickName = chatId;          익명 객체에서 로컬 변수는 final 특성을 가지므로 변수에 새 값을 할당할 수 없다.
		Chat chat = new Chat() {
			@Override
			public void start() {
				while(true) {
					String inputData = "안녕하세요";
					String message = "[" + nickName + "]" + inputData;
					sendMessage(message);
				}
			}
		};
		chat.start();
	}
	
	class Chat {
		void start() {}
		void sendMessage(String message) {}
	}
}


