package com.nayemuzzaman.bdnewspaper;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    public static final String PREFERENCES = "PREFERENCES_NAME";
    public static final String WEB_LINKS = "links";
    public static final String WEB_TITLE = "title";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);




        final ImageView prothomalo = (ImageView) findViewById(R.id.prothomalo);
        // Set a click listener on that View

        prothomalo.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the colors View is clicked on.
            @Override
            public void onClick(View view) {
                Intent sambadIntent = new Intent(MainActivity.this, prothomalo.class);
                startActivity(sambadIntent);
            }
        });

        final ImageView bdnews24 = (ImageView) findViewById(R.id.bdnews24);
        // Set a click listener on that View

        bdnews24.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the colors View is clicked on.
            @Override
            public void onClick(View view) {
                Intent samayaIntent = new Intent(MainActivity.this, bdnews24.class);
                startActivity(samayaIntent);
            }
        });

        final ImageView kalerkantho = (ImageView) findViewById(R.id.kalerkantho);
        // Set a click listener on that View

        kalerkantho.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the colors View is clicked on.
            @Override
            public void onClick(View view) {
                Intent prameyaIntent = new Intent(MainActivity.this, kalerkantho.class);
                startActivity(prameyaIntent);
            }
        });


        final ImageView bdprotidin = (ImageView) findViewById(R.id.bdprotidin);
        // Set a click listener on that View

        bdprotidin.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the colors View is clicked on.
            @Override
            public void onClick(View view) {
                Intent samajaIntent = new Intent(MainActivity.this, bdprotidin.class);
                startActivity(samajaIntent);
            }
        });

        final ImageView ntvbd = (ImageView) findViewById(R.id.ntvbd);
        // Set a click listener on that View

        ntvbd.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the colors View is clicked on.
            @Override
            public void onClick(View view) {
                Intent pragatibadiIntent = new Intent(MainActivity.this, ntvbd.class);
                startActivity(pragatibadiIntent);
            }
        });

        final ImageView banglanews24 = (ImageView) findViewById(R.id.banglanews24);
        // Set a click listener on that View

        banglanews24.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the colors View is clicked on.
            @Override
            public void onClick(View view) {
                Intent dharitriIntent = new Intent(MainActivity.this, banglanews24.class);
                startActivity(dharitriIntent);
            }
        });

        final ImageView mzamin = (ImageView) findViewById(R.id.mzamin);
        // Set a click listener on that View

        mzamin.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the colors View is clicked on.
            @Override
            public void onClick(View view) {
                Intent odishaexclusiveIntent = new Intent(MainActivity.this, Mzamin.class);
                startActivity(odishaexclusiveIntent);
            }
        });

        final ImageView ittefaq = (ImageView) findViewById(R.id.ittefaq);
        // Set a click listener on that View

        ittefaq.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the colors View is clicked on.
            @Override
            public void onClick(View view) {
                Intent otvIntent = new Intent(MainActivity.this, Ittefaq.class);
                startActivity(otvIntent);
            }
        });



        final ImageView jugantor = (ImageView) findViewById(R.id.jugantor);
        // Set a click listener on that View

        jugantor.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the colors View is clicked on.
            @Override
            public void onClick(View view) {
                Intent dinalipiIntent = new Intent(MainActivity.this, Jugantor.class);
                startActivity(dinalipiIntent);
            }
        });



        final ImageView jagonews24 = (ImageView) findViewById(R.id.jagonews24);
        // Set a click listener on that View

        jagonews24.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the colors View is clicked on.
            @Override
            public void onClick(View view) {
                Intent odishabhaskarIntent = new Intent(MainActivity.this, Jagonews24.class);
                startActivity(odishabhaskarIntent);
            }
        });


        final ImageView bangla = (ImageView) findViewById(R.id.bangla);
        // Set a click listener on that View

        bangla.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the colors View is clicked on.
            @Override
            public void onClick(View view) {
                Intent anupambharatIntent = new Intent(MainActivity.this, Bangla.class);
                startActivity(anupambharatIntent);
            }
        });

        final ImageView samakal = (ImageView) findViewById(R.id.samakal);
        // Set a click listener on that View

        samakal.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the colors View is clicked on.
            @Override
            public void onClick(View view) {
                Intent odishareporterIntent = new Intent(MainActivity.this, Samakal.class);
                startActivity(odishareporterIntent);
            }
        });
        final ImageView inqilab = (ImageView) findViewById(R.id.inqilab);
        // Set a click listener on that View

        inqilab.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the colors View is clicked on.
            @Override
            public void onClick(View view) {
                Intent inqilabIntent = new Intent(MainActivity.this, Inqilab.class);
                startActivity(inqilabIntent);
            }
        });

        final ImageView nayadiganta = (ImageView) findViewById(R.id.nayadiganta);
        // Set a click listener on that View

        nayadiganta.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the colors View is clicked on.
            @Override
            public void onClick(View view) {
                Intent nayadigantaIntent = new Intent(MainActivity.this, Nayadiganta.class);
                startActivity(nayadigantaIntent);
            }
        });

        final ImageView vorerpata = (ImageView) findViewById(R.id.vorerpata);
        // Set a click listener on that View

        vorerpata.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the colors View is clicked on.
            @Override
            public void onClick(View view) {
                Intent vorerpataIntent = new Intent(MainActivity.this, Vorerpata.class);
                startActivity(vorerpataIntent);
            }
        });

        final ImageView janakantha = (ImageView) findViewById(R.id.janakantha);
        // Set a click listener on that View

        janakantha.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the colors View is clicked on.
            @Override
            public void onClick(View view) {
                Intent janakanthaIntent = new Intent(MainActivity.this, Janakantha.class);
                startActivity(janakanthaIntent);
            }
        });

        final ImageView manobkantha = (ImageView) findViewById(R.id.manobkantha);
        // Set a click listener on that View

        manobkantha.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the colors View is clicked on.
            @Override
            public void onClick(View view) {
                Intent manobkanthaIntent = new Intent(MainActivity.this, manobkantha.class);
                startActivity(manobkanthaIntent);
            }
        });


        final ImageView alokitobangladesh = (ImageView) findViewById(R.id.alokitobangladesh);
        // Set a click listener on that View

        alokitobangladesh.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the colors View is clicked on.
            @Override
            public void onClick(View view) {
                Intent alokitobangladeshIntent = new Intent(MainActivity.this, Alokitobangladesh.class);
                startActivity(alokitobangladeshIntent);
            }
        });

        final ImageView risingbd = (ImageView) findViewById(R.id.risingbd);
        // Set a click listener on that View

        risingbd.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the colors View is clicked on.
            @Override
            public void onClick(View view) {
                Intent risingbdIntent = new Intent(MainActivity.this, Risingbd.class);
                startActivity(risingbdIntent);
            }
        });

        final ImageView bbcbangla = (ImageView) findViewById(R.id.bbcbangla);
        // Set a click listener on that View

        bbcbangla.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the colors View is clicked on.
            @Override
            public void onClick(View view) {
                Intent manobkanthaIntent = new Intent(MainActivity.this, Bbcbangla.class);
                startActivity(manobkanthaIntent);
            }
        });

        final ImageView cricbuzz = (ImageView) findViewById(R.id.cricbuzz);
        // Set a click listener on that View

        cricbuzz.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the colors View is clicked on.
            @Override
            public void onClick(View view) {
                Intent cricbuzzIntent = new Intent(MainActivity.this, Cricbuzz.class);
                startActivity(cricbuzzIntent);
            }
        });

        final ImageView rtv = (ImageView) findViewById(R.id.rtv);
        // Set a click listener on that View

        rtv.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the colors View is clicked on.
            @Override
            public void onClick(View view) {
                Intent rtvIntent = new Intent(MainActivity.this, Rtv.class);
                startActivity(rtvIntent);
            }
        });

        final ImageView roarbangla = (ImageView) findViewById(R.id.roarbangla);
        // Set a click listener on that View

        roarbangla.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the colors View is clicked on.
            @Override
            public void onClick(View view) {
                Intent roarbanglaIntent = new Intent(MainActivity.this, Roarbangla.class);
                startActivity(roarbanglaIntent);
            }
        });


    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {



            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Are you sure you want to exit?")
                    .setCancelable(false)
                    .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
//                            MainActivity.super.onBackPressed();
//                            MainActivity.this.finish();
                            moveTaskToBack(true);
                            android.os.Process.killProcess(android.os.Process.myPid());
                            System.exit(1);
                        }
                    })

                    .setNegativeButton("No", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                        }
                    });

            AlertDialog alertDialog= builder.create();
            alertDialog.show();

        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {


            try{
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse("market://details?id=com.nayemuzzaman.bdnewspaper")));
            } catch (ActivityNotFoundException e){
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://play.google.com/store/apps/details?id=com.nayemuzzaman.bdnewspaper")));
            }
            //return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        // do things when nav bar item selected

        if (id == R.id.nav_camera) {

            Intent homeIntent = new Intent(this, MainActivity.class);
            startActivity(homeIntent);



        } else if (id == R.id.nav_bookmark) {
            Intent bookmarkActivityIntent = new Intent(this, BookmarkActivity.class);
            startActivity(bookmarkActivityIntent);


        } else if (id == R.id.nav_slideshow) {
            Intent aboutIntent = new Intent(this, AboutUs.class);
            startActivity(aboutIntent);

        } else if (id == R.id.nav_exit) {

            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Are you sure you want to exit?")
                    .setCancelable(false)
                    .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                          //  MainActivity.super.onBackPressed();
                            moveTaskToBack(true);
                            android.os.Process.killProcess(android.os.Process.myPid());
                            System.exit(1);
                        }
                    })

                    .setNegativeButton("No", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                        }
                    });

            AlertDialog alertDialog= builder.create();
            alertDialog.show();



          /*  moveTaskToBack(true);
            android.os.Process.killProcess(android.os.Process.myPid());
            System.exit(1);**/

        } else if (id == R.id.nav_share) {
            Intent shareIntent = new Intent(Intent.ACTION_SEND);
            shareIntent.setType("text/plain");
            String shareBody="Download this Amazing App";
            String sharesub="You can read all BD news paper in this one app.. must give it a try     Download Now:- https://play.google.com/store/apps/details?id=com.nayemuzzaman.bdnewspaper";
            shareIntent.putExtra(Intent.EXTRA_SUBJECT,shareBody);
            shareIntent.putExtra(Intent.EXTRA_TEXT,sharesub);
            startActivity(Intent.createChooser(shareIntent,"Share using"));

        } else if (id == R.id.nav_odiawordbook) {
            try{
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse("market://details?id=com.nayemuzzaman.education.learning")));
            } catch (ActivityNotFoundException e){
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse("play.google.com/store/apps/details?id=com.nayemuzzaman.education.learning")));
            }

        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;





    }
}