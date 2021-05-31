package factoryMethod_pattern;

import java.util.Date;

public class MpCreator extends ItemCreater {

	@Override
	protected void requestItemsInfo() {
		System.out.println("데이터베이스에서 마력 회복 물약의 정보를 가져옵니다.");

	}

	@Override
	protected void createItemsLog() {
		System.out.println("마력 회복 물약을 새로 생성 했습니다. " + new Date());
	}

	@Override
	protected Item createItem() {
		return new MpPotion();
	}

}
