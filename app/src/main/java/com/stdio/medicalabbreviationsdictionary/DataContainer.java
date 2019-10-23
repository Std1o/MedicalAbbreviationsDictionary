package com.stdio.medicalabbreviationsdictionary;

import java.util.ArrayList;

public class DataContainer {

    private ArrayList<DataModel> dataList;

    public void initializeData(){
        dataList = new ArrayList<>();
        dataList.add(new DataModel("Wert", "Показатель, величина"));
        dataList.add(new DataModel("Ergebnis", "результат"));
        dataList.add(new DataModel("Kommentar", "комментарий"));
        dataList.add(new DataModel("Dieses Schreiben wurde maschinell erstellt und ist ohne Unterschrift gültig", "Заключение составлено в электронном виде и действительно без подписи (стандартное окончание в письме)"));
        dataList.add(new DataModel("Befund ausstehend (wird im endgültigen Arztbrief nachgereicht)", "Заключение не готово (и будет выслано в заключительном медицинском отчете)"));
        dataList.add(new DataModel("ALT, Alanin-Aminotransferase", "Аланинаминотрансфераза (АЛТ или ГПТ)"));
        dataList.add(new DataModel("AST, Aspartat-Aminotransferase", "Аспартатаминотрансфераза (АСТ или ГОТ)"));
        dataList.add(new DataModel("GOT, Glutamat-Oxalacetat-Transaminase", "ГОТ, глютаминовая оксалоацетиновая трансаминаза"));
        dataList.add(new DataModel("GPT, Glutamat-Pyruvat-Transaminase", "ГПТ, глутамат-пируват-трансаминаза"));
        dataList.add(new DataModel("Bilirubin gesamt", "Билирубин общий"));
        dataList.add(new DataModel("Bilirubin direkt", "Прямой билирубин"));
        dataList.add(new DataModel("Glukose", "Глюкоза (сахар)"));
        dataList.add(new DataModel("Kreatinin", "Креатинин"));
        dataList.add(new DataModel("Harnstoff", "Мочевина"));
        dataList.add(new DataModel("Eiweiss gesamt im Serum", "Общий белок в сыворотке"));
        dataList.add(new DataModel("Gesamtkalzium", ""));
        dataList.add(new DataModel("CEA", "Раково-эмбриональный антиген (РЭА)"));
        dataList.add(new DataModel("CA-125", "Антиген СА 125"));
        dataList.add(new DataModel("CA 19-9", "Антиген СА 19-9"));
        dataList.add(new DataModel("Blutsenkungsgeschwindigkeit nach der Westergren", "СОЭ по Вестергрену (скорость оседания эритроцитов)"));
        dataList.add(new DataModel("Leukozyten (WBC)", "Лейкоциты ()"));
        dataList.add(new DataModel("Erythrozyten (RBС)", "Эритроциты"));
        dataList.add(new DataModel("Hämoglobin (HGB)", "Гемоглобин"));
        dataList.add(new DataModel("Hämatokrit (НСТ)", "Гематокрит"));
        dataList.add(new DataModel("MCV (mittleres Erythrozyteneinzelvolume)", "Средний объём эритроцита"));
        dataList.add(new DataModel("MCH (mittleres korpuskulares Hämoglobin)", "Среднее содержание гемоглобина"));
        dataList.add(new DataModel("MCHC (mittleres korpuskulares Hämoglobinkonzentration)", "Средняя концентрация гемоглобина"));
        dataList.add(new DataModel("Thrombozyten (PLT)", "Тромбоциты"));
        dataList.add(new DataModel("Lymphozyten (LYMPH) (LYM)", "Лимфоциты"));
        dataList.add(new DataModel("Monozyten (MONO)", "Моноциты"));
        dataList.add(new DataModel("Neutrophile (NEUT)", "Нейтрофилы"));
        dataList.add(new DataModel("Eosinophile (ЕО)", "Эозинофилы"));
        dataList.add(new DataModel("Basophile (BASO)", "Базофилы"));
        dataList.add(new DataModel("RDW (Erythrozytenvolumenverteilungsbreite)", "Распределение эритроцитов по объёму"));
        dataList.add(new DataModel("RDW-SD (Erythrozytenverteilungsbreite)", "Ширина распределения эритроцитов – стандартное отклонение (red cell distribution width, standard deviation)"));
        dataList.add(new DataModel("Thrombozytenverteilungsbreite", "Ширина распределения тромбоцитов"));
        dataList.add(new DataModel("MPV mittleres Thrombozytenvolumen", "Средний объём тромбоцита"));
        dataList.add(new DataModel("P-LCR", "Содержание крупных тромбоцитов"));
        dataList.add(new DataModel("Thrombokrit", "тромбокрит"));
        dataList.add(new DataModel("Metamyelozyten", "Метамиелоциты"));
        dataList.add(new DataModel("Stabkernige", "Палочкоядерные"));
        dataList.add(new DataModel("Segmentkernige", "Сегментоядерные"));
        dataList.add(new DataModel("Summe der Granulozyten", "Сумма гранулоцитов"));
        dataList.add(new DataModel("Lymphoide Zellen", "Лимфоидные клетки"));
        dataList.add(new DataModel("Prolymphozyt", "Пролимфоциты"));
        dataList.add(new DataModel("Blasten", "Бласты"));
        dataList.add(new DataModel("Gerinnung", "Свертываемость (показатели свертываемости крови)"));
        dataList.add(new DataModel("Gerinnungparameter", "Свертываемость (показатели свертываемости крови)"));
        dataList.add(new DataModel("Calcuim, Ca", "Кальций"));
        dataList.add(new DataModel("Kalium, K", "Калий"));
        dataList.add(new DataModel("Natrium, Na", "Натрий"));
        dataList.add(new DataModel("Phosphat in Serum", "Фосфат в сыворотке"));
        dataList.add(new DataModel("Phosphat", "Фосфат"));
        dataList.add(new DataModel("Ferritin", "Ферритин"));
        dataList.add(new DataModel("Magnesium", "магний"));
        dataList.add(new DataModel("AP, alkalische Phosphatase", "ЩФ, щелочная фосфатаза"));
        dataList.add(new DataModel("Alpha-Amylase", "Альфа-амилаза"));
        dataList.add(new DataModel("CK gesamt", "Креатинкиназа общая"));
        dataList.add(new DataModel("Zink", "Цинк"));
        dataList.add(new DataModel("Harnsäure", "Мочевая кислота"));
        dataList.add(new DataModel("Gamma-GT", "Гамма-глутамилтранфераза"));
        dataList.add(new DataModel("LDH Laktatdehidrogenaze", "Лактатдегидрогеназа, ЛДГ"));
        dataList.add(new DataModel("Lipase", "Липаза"));
        dataList.add(new DataModel("IgA, Immunoglobulin A", "IgA, Иммуноглобулин А"));
        dataList.add(new DataModel("IgG, Immunoglobulin G", "IgG, Иммуноглобулин G"));
        dataList.add(new DataModel("IgM, Immunoglobulin M", "IgM, Иммуноглобулин M"));
        dataList.add(new DataModel("Cholesterin ", "Холестерин"));
        dataList.add(new DataModel("LDL", "ЛПНП (липопротеины низкой плотности)"));
        dataList.add(new DataModel("HDL", "ЛПВП (липопротеины высокой плотности)"));
        dataList.add(new DataModel("HbA1c", "Гликированный гемоглобин"));
        dataList.add(new DataModel("CRP, C-reaktives Protein", "СРБ, С-реактивный белок"));
        dataList.add(new DataModel("Cholesterin, Cholesterol", "Холестерин, холестерол – одно и то же"));
        dataList.add(new DataModel("Atherogen-Index", "Атерогенный индекс"));
        dataList.add(new DataModel("Glykosyliertes Hämoglobin", "Гликированый гемоглобин, гликолизированный гемоглобин"));
        dataList.add(new DataModel("Lymphozyten, % (LYMPH%) (LYM%)", "Лимфоциты, %"));
        dataList.add(new DataModel("Monozyten, % (MONO%)", "Моноциты, %"));
        dataList.add(new DataModel("Neutrophile, % (NEUT%)", "Нейтрофилы, %"));
        dataList.add(new DataModel("Eosinophile, %  (ЕО%)", "Эозинофилы, %"));
        dataList.add(new DataModel("Basophile, % (BASO%)", "Базофилы, %"));
        dataList.add(new DataModel("Unreife Granulozyten, abs", "Незрелые гранулоциты, абсолютное кличество"));
        dataList.add(new DataModel("Unreife Granulozyten, %", "Незрелые гранулоциты, %"));
        dataList.add(new DataModel("Normoblasten, absolut ", "нормобласты, абс. показатель "));
        dataList.add(new DataModel("Normoblasten, %", "нормобласты, %"));
        dataList.add(new DataModel("BSG, Blutsenkungsgeschwindigkeit", "СОЭ, скорость оседания эритроцитов"));
        dataList.add(new DataModel("Nach Westergren", "По Верстергрену"));
        dataList.add(new DataModel("24-St. Diurese", "Суточный диурез"));
        dataList.add(new DataModel("Tagesdiurese", "Дневной диурез"));
        dataList.add(new DataModel("Nachtdiurese", "Ночной диурез"));
        dataList.add(new DataModel("С-reaktives Protein hochsensitiv", "СРБ, высокочувствительный"));
        dataList.add(new DataModel("Kommentar", "комментарий"));
    }

    public ArrayList<DataModel> getData() {
        return dataList;
    }

}
