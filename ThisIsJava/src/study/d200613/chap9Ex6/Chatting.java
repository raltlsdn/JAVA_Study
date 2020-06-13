package study.d200613.chap9Ex6;

public class Chatting {
	void startChat(String chatId) {
		String nickName = chatId;
//		nickName = chatId;          �͸� ��ü���� ���� ������ final Ư���� �����Ƿ� ������ �� ���� �Ҵ��� �� ����.
		Chat chat = new Chat() {
			@Override
			public void start() {
				while(true) {
					String inputData = "�ȳ��ϼ���";
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


