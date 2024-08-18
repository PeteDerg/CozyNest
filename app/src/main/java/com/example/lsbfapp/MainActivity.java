//Code is written by Petr Dergachev S103281
package com.example.lsbfapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;  // Displays the selected apartment image
    private TextView textView;    // Displays the selected apartment description

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize the ImageView and TextView components
        imageView = findViewById(R.id.imageView);
        textView = findViewById(R.id.textView);

        // Set up listeners for buttons
        setUpButtonListeners();
    }

    /**
     * Sets up click listeners for all buttons to update the content displayed in the ImageView and TextView.
     */
    private void setUpButtonListeners() {
        // Find buttons by their IDs
        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);
        Button button6 = findViewById(R.id.button6);
        Button button7 = findViewById(R.id.button7);
        Button button8 = findViewById(R.id.button8);
        Button button9 = findViewById(R.id.button9);
        Button button10 = findViewById(R.id.button10);

        // Assign click listeners to each button
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Update content with the image and description for Apartment 1
                updateContent(R.drawable.ap1, "Apartment №1\n" +
                        "\n" +
                        "Description: A modern, cozy living space featuring a chic interior with natural light flooding through large windows. Perfect for those who appreciate both comfort and style.\n" +
                        "Price: $1,500/month");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Update content with the image and description for Apartment 2
                updateContent(R.drawable.ap2, "Apartment №2\n" +
                        "\n" +
                        "Description: This luxurious apartment offers a spacious open-plan living area, complete with high-end finishes and stunning city views. Ideal for urban dwellers.\n" +
                        "Price: $2,300/month");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Update content with the image and description for Apartment 3
                updateContent(R.drawable.ap3, "Apartment №3\n" +
                        "\n" +
                        "Description: A minimalist, elegantly designed studio that makes efficient use of space. The perfect choice for a single professional or a couple.\n" +
                        "Price: $1,200/month");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Update content with the image and description for Apartment 4
                updateContent(R.drawable.ap4, "Apartment №4\n" +
                        "\n" +
                        "Description: A bright and airy one-bedroom apartment featuring floor-to-ceiling windows and a warm, inviting living area. A serene retreat in the heart of the city.\n" +
                        "Price: $1,800/month");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Update content with the image and description for Apartment 5
                updateContent(R.drawable.ap5, "Apartment №5\n" +
                        "\n" +
                        "Description: A luxury apartment with a stylish design and modern amenities. Includes a large kitchen, spacious living room, and an outdoor balcony with breathtaking views.\n" +
                        "Price: $2,500/month");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Update content with the image and description for Apartment 6
                updateContent(R.drawable.ap6, "Apartment №6\n" +
                        "\n" +
                        "Description: A contemporary two-bedroom apartment with sleek interiors, offering a blend of comfort and sophistication. The ideal family home.\n" +
                        "Price: $2,000/month");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Update content with the image and description for Apartment 7
                updateContent(R.drawable.ap7, "Apartment №7\n" +
                        "\n" +
                        "Description: This well-appointed apartment combines modern decor with classic elements. Featuring a large living room and a fully-equipped kitchen.\n" +
                        "Price: $1,700/month");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Update content with the image and description for Apartment 8
                updateContent(R.drawable.ap8, "Apartment №8\n" +
                        "\n" +
                        "Description: A stunning penthouse apartment with panoramic views, high ceilings, and luxury finishes throughout. Perfect for those seeking the pinnacle of city living.\n" +
                        "Price: $3,500/month");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Update content with the image and description for Apartment 9
                updateContent(R.drawable.ap9, "Apartment №9\n" +
                        "\n" +
                        "Description: A spacious three-bedroom apartment with a contemporary design, perfect for families. Includes a large balcony and ample storage space.\n" +
                        "Price: $2,800/month");
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Update content with the image and description for Apartment 10
                updateContent(R.drawable.ap10, "Apartment №10\n" +
                        "\n" +
                        "Description: An exquisite apartment offering top-of-the-line appliances, premium flooring, and a sleek, modern aesthetic. Ideal for those with a taste for luxury.\n" +
                        "Price: $3,200/month");
            }
        });
    }

    /**
     * Updates the ImageView and TextView with the provided image and description.
     *
     * @param imageResId The resource ID of the image to be displayed.
     * @param description The description text to be displayed.
     */
    private void updateContent(int imageResId, String description) {
        imageView.setImageResource(imageResId);
        textView.setText(description);
    }
}
