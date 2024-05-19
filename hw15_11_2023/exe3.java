package hw15_11_2023;

public class exe3 {
    public static void main(String[] args) {
        // Когда закончится учебный год (isYearFinished)
        // и если будет солнечная погода (isGoodWeather),
        // то ребята пойдут в поход.
        // Если тур-кружок закупит дождевики (hasBoughtRaincoats) к концу учебного года,
        // то ребята пойдут в поход даже в плохую погоду.
        // В поход ребят должен кто-то повести.
        // Поведёт тренер Джим,
        // если он освободится от сдачи тренерского экзамена (isJimFree),
        // или тренер Кейт, если она вернётся с путешествия (hasKateComeBack).
        // Вести детей может только один тренер.
        // Если Джим и Кейт смогут вести детей вместе,
        // то они обязательно поссорятся из-за этого и никто никуда не пойдёт.
        // Напишите логическое выражение для вычисления того, состоится ли поход.
        // Подберите условия, при которых поход состоится.

        boolean isYearFinished = true;
        boolean isGoodWeather = true;
        boolean hasBoughtRaincoats = true;
        boolean isGuysBadWeather = true;
        boolean isCoachJim = true;
        boolean isJimFree = true;
        boolean isCoachKate = true;
        boolean hasKateComeBack = false;
        boolean isGuysToHike = (isYearFinished && isGoodWeather)
                && (hasBoughtRaincoats || isGuysBadWeather)
                && (isCoachJim || isJimFree)
                && (isCoachKate || hasKateComeBack);
        System.out.println(isGuysToHike);
    }
}
