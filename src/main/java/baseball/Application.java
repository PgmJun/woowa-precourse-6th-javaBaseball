package baseball;

import baseball.ui.InputView;
import baseball.ui.OutputView;

public class Application {
    public static void main(String[] args) {
        OutputView outputView = new OutputView();
        InputView inputView = new InputView(outputView);
        BaseballGame game = new BaseballGame(outputView, inputView);

        game.start();
    }
}
