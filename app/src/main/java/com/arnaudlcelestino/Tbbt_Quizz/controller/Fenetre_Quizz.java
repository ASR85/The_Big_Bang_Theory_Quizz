package com.arnaudlcelestino.Tbbt_Quizz.controller;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.arnaudlcelestino.Tbbt_Quizz.model.Banque_Questions;
import com.arnaudlcelestino.Tbbt_Quizz.model.Question;
import com.arnaudlcelestino.The_Big_Bang_Theory_Quiz.R;

import java.util.Arrays;

public class Fenetre_Quizz extends AppCompatActivity implements View.OnClickListener {

    private TextView textQuestion;
    private Button reponse1;
    private Button reponse2;
    private Button reponse3;
    private Button reponse4;

    private Banque_Questions mBanque_Questions;
    private Question mQuestionActuelle;

    private int mScore = 0;
    private int nombreQuestion = 10;
    public static final String BUNDLE_EXTRA_SCORE = "BUNDLE_EXTRA_SCORE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fenetre__quizz);

        mBanque_Questions = this.genererQuestion();

        textQuestion = (TextView) findViewById(R.id.textQuestion);
        reponse1 = (Button) findViewById(R.id.reponse1);
        reponse2 = (Button) findViewById(R.id.reponse2);
        reponse3 = (Button) findViewById(R.id.reponse3);
        reponse4 = (Button) findViewById(R.id.reponse4);

        reponse1.setTag(0);
        reponse2.setTag(1);
        reponse3.setTag(2);
        reponse4.setTag(3);

        reponse1.setOnClickListener(this);
        reponse2.setOnClickListener(this);
        reponse3.setOnClickListener(this);
        reponse4.setOnClickListener(this);

        mQuestionActuelle = mBanque_Questions.getQuestion();
        this.afficherQuestion(mQuestionActuelle);

    }

    private void afficherQuestion(final Question question) {

        textQuestion.setText(question.getmQuestion());
        reponse1.setText(question.getmListQ().get(0));
        reponse2.setText(question.getmListQ().get(1));
        reponse3.setText(question.getmListQ().get(2));
        reponse4.setText(question.getmListQ().get(3));
    }

    private Banque_Questions genererQuestion() {

        Question q1 = new Question("Quel est le QI de Sheldon?", Arrays.asList("187", "200", "220", "189"), 0);
        Question q2 = new Question("?", Arrays.asList("", "'", "", ""), 1);
        Question q3 = new Question("?", Arrays.asList("", "'", "", ""), 1);
        Question q4 = new Question("?", Arrays.asList("", "'", "", ""), 1);
        Question q5 = new Question("?", Arrays.asList("", "'", "", ""), 1);
        Question q6 = new Question("?", Arrays.asList("", "'", "", ""), 1);
        Question q7 = new Question("?", Arrays.asList("", "'", "", ""), 1);
        Question q8 = new Question("?", Arrays.asList("", "'", "", ""), 1);
        Question q9 = new Question("?", Arrays.asList("", "'", "", ""), 1);
        Question q10 = new Question("?", Arrays.asList("", "'", "", ""), 1);

        Question q11 = new Question("?", Arrays.asList("", "'", "", ""), 1);
        Question q12 = new Question("?", Arrays.asList("", "'", "", ""), 1);
        Question q13 = new Question("?", Arrays.asList("", "'", "", ""), 1);
        Question q14 = new Question("?", Arrays.asList("", "'", "", ""), 1);
        Question q15 = new Question("?", Arrays.asList("", "'", "", ""), 1);
        Question q16 = new Question("?", Arrays.asList("", "'", "", ""), 1);
        Question q17 = new Question("?", Arrays.asList("", "'", "", ""), 1);
        Question q18 = new Question("?", Arrays.asList("", "'", "", ""), 1);
        Question q19 = new Question("?", Arrays.asList("", "'", "", ""), 1);
        Question q20 = new Question("?", Arrays.asList("", "'", "", ""), 1);

        Question q21 = new Question("?", Arrays.asList("", "'", "", ""), 1);
        Question q22 = new Question("?", Arrays.asList("", "'", "", ""), 1);
        Question q23 = new Question("?", Arrays.asList("", "'", "", ""), 1);
        Question q24 = new Question("?", Arrays.asList("", "'", "", ""), 1);
        Question q25 = new Question("?", Arrays.asList("", "'", "", ""), 1);
        Question q26 = new Question("?", Arrays.asList("", "'", "", ""), 1);
        Question q27 = new Question("?", Arrays.asList("", "'", "", ""), 1);
        Question q28 = new Question("?", Arrays.asList("", "'", "", ""), 1);
        Question q29 = new Question("?", Arrays.asList("", "'", "", ""), 1);
        Question q30 = new Question("?", Arrays.asList("", "'", "", ""), 1);

        Question q31 = new Question("?", Arrays.asList("", "'", "", ""), 1);
        Question q32 = new Question("?", Arrays.asList("", "'", "", ""), 1);
        Question q33 = new Question("?", Arrays.asList("", "'", "", ""), 1);
        Question q34 = new Question("?", Arrays.asList("", "'", "", ""), 1);
        Question q35 = new Question("?", Arrays.asList("", "'", "", ""), 1);
        Question q36 = new Question("?", Arrays.asList("", "'", "", ""), 1);
        Question q37 = new Question("?", Arrays.asList("", "'", "", ""), 1);
        Question q38 = new Question("?", Arrays.asList("", "'", "", ""), 1);
        Question q39 = new Question("?", Arrays.asList("", "'", "", ""), 1);
        Question q40 = new Question("?", Arrays.asList("", "'", "", ""), 1);

        Question q41 = new Question("?", Arrays.asList("", "'", "", ""), 1);
        Question q42 = new Question("?", Arrays.asList("", "'", "", ""), 1);
        Question q43 = new Question("?", Arrays.asList("", "'", "", ""), 1);
        Question q44 = new Question("?", Arrays.asList("", "'", "", ""), 1);
        Question q45 = new Question("?", Arrays.asList("", "'", "", ""), 1);
        Question q46 = new Question("?", Arrays.asList("", "'", "", ""), 1);
        Question q47 = new Question("?", Arrays.asList("", "'", "", ""), 1);
        Question q48 = new Question("?", Arrays.asList("", "'", "", ""), 1);
        Question q49 = new Question("?", Arrays.asList("", "'", "", ""), 1);
        Question q50 = new Question("?", Arrays.asList("", "'", "", ""), 1);


        return new Banque_Questions(Arrays.asList(q1/*, q2, q3, q4, q5, q6, q7, q8, q9, q10,
                q11, q12, q13, q14, q15, q16, q17, q18, q19, q20
                                          ,q21,q22,q23,q24,q24,q25,q26,q27,q28,q29,q30,
                                          q31,q32,q33,q34,q35,q36,q37,q38,q39,q40,
                                          q41,q42,q43,q44,q45,q46,q47,q48,q49,q50*/
        ));

    }

    @Override
    public void onClick(View v) {
        //On récupère l'indice du bonton lors du clic afin de tester si la réponse est bonne ou pas
        int reponseIndex = (int) v.getTag();

        if (reponseIndex == mQuestionActuelle.getIndexReponse()) {

            //Si indentifiant est bon la réponse est bnonne

            Toast.makeText(this, "Bonne réponse!", Toast.LENGTH_SHORT).show();
            mScore++;
        } else {

            //Sinon la réponse est mauvaise
            Toast.makeText(this, "Mauvaise réponse!", Toast.LENGTH_SHORT).show();
        }

        if (--nombreQuestion == 0) {

            finDuJeu();

        } else {

            mQuestionActuelle = mBanque_Questions.getQuestion();
            afficherQuestion(mQuestionActuelle);

        }
    }

    private void finDuJeu() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Le Quizz est terminé !"
        )
                .setMessage("Votre Score est de : " + mScore + "/10 !")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent();
                        intent.putExtra(BUNDLE_EXTRA_SCORE, mScore);
                        setResult(RESULT_OK, intent);
                        finish();
                        finish();

                    }
                })
                .create()
                .show();
        mScore = 0;
    }


}
