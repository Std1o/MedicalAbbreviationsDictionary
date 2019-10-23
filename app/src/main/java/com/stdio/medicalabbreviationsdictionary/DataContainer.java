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
        dataList.add(new DataModel("Kommentar", "комментарий"));
    }

    public ArrayList<DataModel> getData() {
        return dataList;
    }

}
