package com.ug.air.alrite.Utils.Calculations;

import com.ug.air.alrite.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Instructions {

    public List GetInstructions(float ag, String weight, String s){

        List<Integer> messages = new ArrayList<>();

        if (!weight.isEmpty()){
            float we = Float.parseFloat(weight);
            if (we >= 4.0 && we < 6.0){
                if (s.contains("Convulsions")){
                    messages = Arrays.asList(R.string.first_dose, R.string.ampicilin2, R.string.gentamicin2,
                            R.string.convulsions, R.string.diazepam2, R.string.convulsions1,
                            R.string.convulsions2, R.string.convulsions3, R.string.convulsions4,
                            R.string.convulsions5, R.string.other1, R.string.other2, R.string.other3,
                            R.string.other4, R.string.other5, R.string.other6, R.string.other7,
                            R.string.other8, R.string.refer_urgently);
                }else{
                    messages = Arrays.asList(R.string.first_dose, R.string.ampicilin2, R.string.gentamicin2,
                            R.string.other1, R.string.other2, R.string.other3,
                            R.string.other4, R.string.other5, R.string.other6, R.string.other7,
                            R.string.other8, R.string.refer_urgently);
                }
            }else if (we >= 6.0 && we < 10.0){
                if (s.contains("Convulsions")){
                    messages = Arrays.asList(R.string.first_dose, R.string.ampicilin4, R.string.gentamicin4,
                            R.string.convulsions, R.string.diazepam4, R.string.convulsions1,
                            R.string.convulsions2, R.string.convulsions3, R.string.convulsions4,
                            R.string.convulsions5, R.string.other1, R.string.other2, R.string.other3,
                            R.string.other4, R.string.other5, R.string.other6, R.string.other7,
                            R.string.other8, R.string.refer_urgently);
                }else{
                    messages = Arrays.asList(R.string.first_dose, R.string.ampicilin4, R.string.gentamicin4,
                            R.string.other1, R.string.other2, R.string.other3,
                            R.string.other4, R.string.other5, R.string.other6, R.string.other7,
                            R.string.other8, R.string.refer_urgently);
                }
            }else if (we >= 10.0 && we < 14.0){
                if (s.contains("Convulsions")){
                    messages = Arrays.asList(R.string.first_dose, R.string.ampicilin12, R.string.gentamicin12,
                            R.string.convulsions, R.string.diazepam12, R.string.convulsions1,
                            R.string.convulsions2, R.string.convulsions3, R.string.convulsions4,
                            R.string.convulsions5, R.string.other1, R.string.other2, R.string.other3,
                            R.string.other4, R.string.other5, R.string.other6, R.string.other7,
                            R.string.other8, R.string.refer_urgently);
                }else{
                    messages = Arrays.asList(R.string.first_dose, R.string.ampicilin12, R.string.gentamicin12,
                            R.string.other1, R.string.other2, R.string.other3,
                            R.string.other4, R.string.other5, R.string.other6, R.string.other7,
                            R.string.other8, R.string.refer_urgently);
                }

            }else if (we >= 14.0){
                if (s.contains("Convulsions")){
                    messages = Arrays.asList(R.string.first_dose, R.string.ampicilin3, R.string.gentamicin3,
                            R.string.convulsions, R.string.diazepam3, R.string.convulsions1,
                            R.string.convulsions2, R.string.convulsions3, R.string.convulsions4,
                            R.string.convulsions5, R.string.other1, R.string.other2, R.string.other3,
                            R.string.other4, R.string.other5, R.string.other6, R.string.other7,
                            R.string.other8, R.string.refer_urgently);
                }else{
                    messages = Arrays.asList(R.string.first_dose, R.string.ampicilin3, R.string.gentamicin3,
                            R.string.other1, R.string.other2, R.string.other3,
                            R.string.other4, R.string.other5, R.string.other6, R.string.other7,
                            R.string.other8, R.string.refer_urgently);
                }

            }

        }else {
            if (ag >= 0.2 && ag < 0.4){
                if (s.contains("Convulsions")){
                    messages = Arrays.asList(R.string.first_dose, R.string.ampicilin2, R.string.gentamicin2,
                            R.string.convulsions, R.string.diazepam2, R.string.convulsions1,
                            R.string.convulsions2, R.string.convulsions3, R.string.convulsions4,
                            R.string.convulsions5, R.string.other1, R.string.other2, R.string.other3,
                            R.string.other4, R.string.other5, R.string.other6, R.string.other7,
                            R.string.other8, R.string.refer_urgently);
                }else{
                    messages = Arrays.asList(R.string.first_dose, R.string.ampicilin2, R.string.gentamicin2,
                            R.string.other1, R.string.other2, R.string.other3,
                            R.string.other4, R.string.other5, R.string.other6, R.string.other7,
                            R.string.other8, R.string.refer_urgently);
                }
            }else if (ag >= 0.4 && ag < 1.0){
                if (s.contains("Convulsions")){
                    messages = Arrays.asList(R.string.first_dose, R.string.ampicilin4, R.string.gentamicin4,
                            R.string.convulsions, R.string.diazepam4, R.string.convulsions1,
                            R.string.convulsions2, R.string.convulsions3, R.string.convulsions4,
                            R.string.convulsions5, R.string.other1, R.string.other2, R.string.other3,
                            R.string.other4, R.string.other5, R.string.other6, R.string.other7,
                            R.string.other8, R.string.refer_urgently);
                }else{
                    messages = Arrays.asList(R.string.first_dose, R.string.ampicilin4, R.string.gentamicin4,
                            R.string.other1, R.string.other2, R.string.other3,
                            R.string.other4, R.string.other5, R.string.other6, R.string.other7,
                            R.string.other8, R.string.refer_urgently);
                }
            }else if (ag >= 1.0 && ag < 3.0){
                if (s.contains("Convulsions")){
                    messages = Arrays.asList(R.string.first_dose, R.string.ampicilin12, R.string.gentamicin12,
                            R.string.convulsions, R.string.diazepam12, R.string.convulsions1,
                            R.string.convulsions2, R.string.convulsions3, R.string.convulsions4,
                            R.string.convulsions5, R.string.other1, R.string.other2, R.string.other3,
                            R.string.other4, R.string.other5, R.string.other6, R.string.other7,
                            R.string.other8, R.string.refer_urgently);
                }else{
                    messages = Arrays.asList(R.string.first_dose, R.string.ampicilin12, R.string.gentamicin12,
                            R.string.other1, R.string.other2, R.string.other3,
                            R.string.other4, R.string.other5, R.string.other6, R.string.other7,
                            R.string.other8, R.string.refer_urgently);
                }

            }else if (ag >= 3.0){
                if (s.contains("Convulsions")){
                    messages = Arrays.asList(R.string.first_dose, R.string.ampicilin3, R.string.gentamicin3,
                            R.string.convulsions, R.string.diazepam3, R.string.convulsions1,
                            R.string.convulsions2, R.string.convulsions3, R.string.convulsions4,
                            R.string.convulsions5, R.string.other1, R.string.other2, R.string.other3,
                            R.string.other4, R.string.other5, R.string.other6, R.string.other7,
                            R.string.other8, R.string.refer_urgently);
                }else{
                    messages = Arrays.asList(R.string.first_dose, R.string.ampicilin3, R.string.gentamicin3,
                            R.string.other1, R.string.other2, R.string.other3,
                            R.string.other4, R.string.other5, R.string.other6, R.string.other7,
                            R.string.other8, R.string.refer_urgently);
                }

            }
        }

        return messages;

    }

    public List GetPneumoniaInstructions(float ag, String weight) {

        List<Integer> messages = new ArrayList<>();

        if (!weight.isEmpty()) {
            float we = Float.parseFloat(weight);
            if (we >= 4.0 && we < 10.0){
                messages = Arrays.asList(R.string.amoxicillin2, R.string.pneumonia1, R.string.pneumonia2);
            }else if (we >= 10.0 && we < 14.0){
                messages = Arrays.asList(R.string.amoxicillin12, R.string.pneumonia1, R.string.pneumonia2);
            }else if (we >= 14.0){
                messages = Arrays.asList(R.string.amoxicillin3, R.string.pneumonia1, R.string.pneumonia2);
            }
        }else {
            if (ag >= 0.2 && ag < 1.0){
                messages = Arrays.asList(R.string.amoxicillin2, R.string.pneumonia1, R.string.pneumonia2);
            }else if (ag >= 1.0 && ag < 3.0){
                messages = Arrays.asList(R.string.amoxicillin12, R.string.pneumonia1, R.string.pneumonia2);
            }else if (ag >= 3.0 && ag < 5.0){
                messages = Arrays.asList(R.string.amoxicillin3, R.string.pneumonia1, R.string.pneumonia2);
            }
        }

        return messages;

    }

    public int GetPointsFromRR(double rate, float age){
        int point = 0;

        if ((rate < 60 && age < 0.2) || (rate < 50 && (age >= 0.2 && age < 1.0)) || (rate < 40 && (age >= 1.0 && age < 5.0))){
            point = 0;
        }else if (((rate >= 60 && rate < 70) && age < 0.2) || ((rate >= 50 && rate < 60) && (age >= 0.2 && age < 1.0)) || ((rate >= 40 && rate < 50) && (age >= 1.0 && age < 5.0))){
            point = 1;
        }else if (((rate >= 70 && rate < 80) && age < 0.2) || ((rate >= 60 && rate < 70) && (age >= 0.2 && age < 1.0)) || ((rate >= 50 && rate < 60) && (age >= 1.0 && age < 5.0))){
            point = 2;
        }else if ((rate >= 80 && age < 0.2) || (rate >= 70 && (age >= 0.2 && age < 1.0)) || (rate >= 60 && (age >= 1.0 && age < 5.0))){
            point = 3;
        }

        return point;
    }

    public int GetWheezing(String wheez, int pt){
        int point = 0;

        if (wheez.equals("Normal breath sounds")){
            point = 0;
        }else if (wheez.equals("Other abnormal breath sounds")){
            point = 2;
        }else if (wheez.equals("Wheezing")){
            point = 3;
        }

        point = point + pt;

        return point;
    }

    public int GetChestIndrawing(String chest, String grunt, int pt){
        int point = 0;

        if (chest.equals("No")){
            point = 0;
        }else if (chest.equals("Mild") && grunt.equals("No")){
            point = 1;
        }else if (chest.equals("Moderate/Severe") && grunt.equals("No")){
            point = 2;
        }else if ((chest.equals("Moderate/Severe") || chest.equals("Mild")) && grunt.equals("Yes")){
            point = 3;
        }

        point = point + pt;

        return point;

    }

}
