package com.example.avramescu.codechallenges.week5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.avramescu.codechallenges.R;
import com.example.avramescu.codechallenges.week3.ScrollViewActivity;

public class SecondActivityButtons extends AppCompatActivity {

    private ScrollViewActivity mScrollView;
    private TextView mTextViewScrollview;

    public static final String textActivitate1 ="Activitate1             +" +
            "Lorem Ipsum este pur şi simplu o machetă pentru text a industriei tipografice. Lorem Ipsum a fost macheta standard a industriei încă din secolul al XVI-lea, când un tipograf anonim a luat o planşetă de litere şi le-a amestecat pentru a crea o carte demonstrativă pentru literele respective. Nu doar că a supravieţuit timp de cinci secole, dar şi a facut saltul în tipografia electronică practic neschimbată. A fost popularizată în anii '60 odată cu ieşirea colilor Letraset care conţineau pasaje Lorem Ipsum, iar mai recent, prin programele de publicare pentru calculator, ca Aldus PageMaker care includeau versiuni de Lorem Ipsum.\n" +
            "\n" +
            "De ce îl folosim?\n" +
            "E un fapt bine stabilit că cititorul va fi sustras de conţinutul citibil al unei pagini atunci când se uită la aşezarea în pagină. Scopul utilizării a Lorem Ipsum, este acela că are o distribuţie a literelor mai mult sau mai puţin normale, faţă de utilizarea a ceva de genul \"Conţinut aici, conţinut acolo\", făcându-l să arate ca o engleză citibilă. Multe pachete de publicare pentru calculator şi editoare de pagini web folosesc acum Lorem Ipsum ca model standard de text, iar o cautare de \"lorem ipsum\" va rezulta în o mulţime de site-uri web în dezvoltare. Pe parcursul anilor, diferite versiuni au evoluat, uneori din intâmplare, uneori intenţionat (infiltrându-se elemente de umor sau altceva de acest gen).\n" +
            "\n" +
            "\n" +
            "De unde provine?\n" +
            "În ciuda opiniei publice, Lorem Ipsum nu e un simplu text fără sens. El îşi are rădăcinile într-o bucată a literaturii clasice latine din anul 45 î.e.n., făcând-o să aibă mai bine de 2000 ani. Profesorul universitar de latină de la colegiul Hampden-Sydney din Virginia, Richard McClintock, a căutat în bibliografie unul din cele mai rar folosite cuvinte latine \"consectetur\", întâlnit în pasajul Lorem Ipsum, şi căutând citate ale cuvântului respectiv în literatura clasică, a descoperit la modul cel mai sigur sursa provenienţei textului. Lorem Ipsum provine din secţiunile 1.10.32 şi 1.10.33 din \"de Finibus Bonorum et Malorum\" (Extremele Binelui şi ale Răului) de Cicerone, scrisă în anul 45 î.e.n. Această carte este un tratat în teoria eticii care a fost foarte popular în perioada Renasterii. Primul rând din Lorem Ipsum, \"Lorem ipsum dolor sit amet...\", a fost luat dintr-un rând din secţiunea 1.10.32.";

    public static final String textActivitate2 ="Activitate2             +" +
            "Lorem Ipsum este pur şi simplu o machetă pentru text a industriei tipografice. Lorem Ipsum a fost macheta standard a industriei încă din secolul al XVI-lea, când un tipograf anonim a luat o planşetă de litere şi le-a amestecat pentru a crea o carte demonstrativă pentru literele respective. Nu doar că a supravieţuit timp de cinci secole, dar şi a facut saltul în tipografia electronică practic neschimbată. A fost popularizată în anii '60 odată cu ieşirea colilor Letraset care conţineau pasaje Lorem Ipsum, iar mai recent, prin programele de publicare pentru calculator, ca Aldus PageMaker care includeau versiuni de Lorem Ipsum.\n" +
            "\n" +
            "De ce îl folosim?\n" +
            "E un fapt bine stabilit că cititorul va fi sustras de conţinutul citibil al unei pagini atunci când se uită la aşezarea în pagină. Scopul utilizării a Lorem Ipsum, este acela că are o distribuţie a literelor mai mult sau mai puţin normale, faţă de utilizarea a ceva de genul \"Conţinut aici, conţinut acolo\", făcându-l să arate ca o engleză citibilă. Multe pachete de publicare pentru calculator şi editoare de pagini web folosesc acum Lorem Ipsum ca model standard de text, iar o cautare de \"lorem ipsum\" va rezulta în o mulţime de site-uri web în dezvoltare. Pe parcursul anilor, diferite versiuni au evoluat, uneori din intâmplare, uneori intenţionat (infiltrându-se elemente de umor sau altceva de acest gen).\n" +
            "\n" +
            "\n" +
            "De unde provine?\n" +
            "În ciuda opiniei publice, Lorem Ipsum nu e un simplu text fără sens. El îşi are rădăcinile într-o bucată a literaturii clasice latine din anul 45 î.e.n., făcând-o să aibă mai bine de 2000 ani. Profesorul universitar de latină de la colegiul Hampden-Sydney din Virginia, Richard McClintock, a căutat în bibliografie unul din cele mai rar folosite cuvinte latine \"consectetur\", întâlnit în pasajul Lorem Ipsum, şi căutând citate ale cuvântului respectiv în literatura clasică, a descoperit la modul cel mai sigur sursa provenienţei textului. Lorem Ipsum provine din secţiunile 1.10.32 şi 1.10.33 din \"de Finibus Bonorum et Malorum\" (Extremele Binelui şi ale Răului) de Cicerone, scrisă în anul 45 î.e.n. Această carte este un tratat în teoria eticii care a fost foarte popular în perioada Renasterii. Primul rând din Lorem Ipsum, \"Lorem ipsum dolor sit amet...\", a fost luat dintr-un rând din secţiunea 1.10.32.";

    public static final String textActivitate3 ="Activitate3             +" +
            "Lorem Ipsum este pur şi simplu o machetă pentru text a industriei tipografice. Lorem Ipsum a fost macheta standard a industriei încă din secolul al XVI-lea, când un tipograf anonim a luat o planşetă de litere şi le-a amestecat pentru a crea o carte demonstrativă pentru literele respective. Nu doar că a supravieţuit timp de cinci secole, dar şi a facut saltul în tipografia electronică practic neschimbată. A fost popularizată în anii '60 odată cu ieşirea colilor Letraset care conţineau pasaje Lorem Ipsum, iar mai recent, prin programele de publicare pentru calculator, ca Aldus PageMaker care includeau versiuni de Lorem Ipsum.\n" +
            "\n" +
            "De ce îl folosim?\n" +
            "E un fapt bine stabilit că cititorul va fi sustras de conţinutul citibil al unei pagini atunci când se uită la aşezarea în pagină. Scopul utilizării a Lorem Ipsum, este acela că are o distribuţie a literelor mai mult sau mai puţin normale, faţă de utilizarea a ceva de genul \"Conţinut aici, conţinut acolo\", făcându-l să arate ca o engleză citibilă. Multe pachete de publicare pentru calculator şi editoare de pagini web folosesc acum Lorem Ipsum ca model standard de text, iar o cautare de \"lorem ipsum\" va rezulta în o mulţime de site-uri web în dezvoltare. Pe parcursul anilor, diferite versiuni au evoluat, uneori din intâmplare, uneori intenţionat (infiltrându-se elemente de umor sau altceva de acest gen).\n" +
            "\n" +
            "\n" +
            "De unde provine?\n" +
            "În ciuda opiniei publice, Lorem Ipsum nu e un simplu text fără sens. El îşi are rădăcinile într-o bucată a literaturii clasice latine din anul 45 î.e.n., făcând-o să aibă mai bine de 2000 ani. Profesorul universitar de latină de la colegiul Hampden-Sydney din Virginia, Richard McClintock, a căutat în bibliografie unul din cele mai rar folosite cuvinte latine \"consectetur\", întâlnit în pasajul Lorem Ipsum, şi căutând citate ale cuvântului respectiv în literatura clasică, a descoperit la modul cel mai sigur sursa provenienţei textului. Lorem Ipsum provine din secţiunile 1.10.32 şi 1.10.33 din \"de Finibus Bonorum et Malorum\" (Extremele Binelui şi ale Răului) de Cicerone, scrisă în anul 45 î.e.n. Această carte este un tratat în teoria eticii care a fost foarte popular în perioada Renasterii. Primul rând din Lorem Ipsum, \"Lorem ipsum dolor sit amet...\", a fost luat dintr-un rând din secţiunea 1.10.32.";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_buttons);

        initView();
    }

    private void initView() {
        mTextViewScrollview = findViewById(R.id.text_view_scroll_view);
    }

    @Override
    protected void onResume(){
        super.onResume();

        String message1 = null;
        String message2 = null;
        String message3 = null;
        Bundle dataReceived =getIntent().getExtras();
        if(dataReceived != null){
            message1 = dataReceived.getString(ActivityButtons.CHEIEBUTON1);
            message2 = dataReceived.getString(ActivityButtons.CHEIEBUTON2);
            message3 = dataReceived.getString(ActivityButtons.CHEIEBUTON3);

            if(message1 != null && message1.equals("mesaj1")){
                mTextViewScrollview.setText(textActivitate1);
            }
            if(message2 != null && message2.equals("mesaj2")){
                mTextViewScrollview.setText(textActivitate2);
            }
            if(message3 != null && message3.equals("mesaj3")){
                mTextViewScrollview.setText(textActivitate3);
            }
        }

    }
}
