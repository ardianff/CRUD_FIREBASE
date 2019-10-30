package ardian.belajar.crudfirebase.View;

import androidx.appcompat.app.AppCompatActivity;
import ardian.belajar.crudfirebase.R;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class DetailActivity extends AppCompatActivity {

    TextView nameDetailTextView,nimDetailTextView,dateDetailTextView,studiDetailTextView;
    ImageView teacherDetailImageView;

    private void initializeWidgets(){
        nameDetailTextView= findViewById(R.id.nameDetailTextView);
        nimDetailTextView= findViewById(R.id.nimDetailTextView);
        dateDetailTextView= findViewById(R.id.dateDetailTextView);
//        studiDetailTextView= findViewById(R.id.studiDetailTextView);
        teacherDetailImageView=findViewById(R.id.teacherDetailImageView);
    }
    private String getDateToday(){
        DateFormat dateFormat=new SimpleDateFormat("yyyy/MM/dd");
        Date date=new Date();
        String today= dateFormat.format(date);
        return today;
    }
//    private String getRandomCategory(){
//        String[] categories={"MABA","SEMESTER TUA","HEHE"};
//        Random random=new Random();
//        int index=random.nextInt(categories.length-1);
//        return categories[index];
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        initializeWidgets();

        //RECEIVE DATA FROM ITEMSACTIVITY VIA INTENT
        Intent i=this.getIntent();
        String name=i.getExtras().getString("NAME_KEY");
        String nim=i.getExtras().getString("NIM_KEY");
        String imageURL=i.getExtras().getString("IMAGE_KEY");
//        String studi=i.getExtras().getString("STUDI_KEY");

        //SET RECEIVED DATA TO TEXTVIEWS AND IMAGEVIEWS
        nameDetailTextView.setText(name);
        nimDetailTextView.setText(nim);
//        studiDetailTextView.setText(studi);
        dateDetailTextView.setText("UPLOAD DATE: "+getDateToday());
//        categoryDetailTextView.setText("CATEGORY: "+getRandomCategory());
        Picasso.with(this)
                .load(imageURL)
                .placeholder(R.drawable.icon_nopic)
                .fit()
                .centerCrop()
                .into(teacherDetailImageView);

    }

}