package com.example.cnu_graduation_project.Resource;

import java.util.Random;

public class WarnMessage {
    /**
     * 경고 문구를 저장하는 클래스
     * 사랑 문구와 혐오 문구가 나타나도록 한다
     */

    public static final String[] WARN_MESSAGE = {
            "운전 중 스마트 폰 사용\n살인 미수 \n 입니다.",
            "한번의 운전 부주의 \n평생을 돌이킬 수 없는 결과",
            "운전중 휴대폰 \n불행의 속삭임",
            "운전중의 휴대전화 \n교통사고 주범이다",
            "운전중의 휴대전화 \n행복은 불통됩니다",
            "운전중에 여보세요 \n저승사자 반가워요",
            "아빠는 운전중 \n휴대폰은 휴식중",
            "운전 중 전화 걸고 있나요? \n당신의 목숨을 걸고 있습니다!"
            // 더 추가하기
    };

//    public static final String[] LOVE_MESSAGE = {
//            "엄마가 맛있는 밥 차려 놯다 \n 안전 운전해서 오렴",
//            "오늘 하루도 고생했어요 \n 조심히 운전해서 가세요"
//            // 더 추가하기
//    };

    public static String getMessage() {
//        int type = new Random().nextInt(2); // 0 또는 1
        int message_index = 0;
        String message = "";

        message_index = new Random().nextInt(WARN_MESSAGE.length);
        message = WARN_MESSAGE[message_index];

        return message;
    }
}
