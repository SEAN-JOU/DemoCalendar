package com.example.democalendar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.haibin.calendarview.library.Calendar;
import com.haibin.calendarview.library.CalendarView;

public class MainActivity extends AppCompatActivity implements
        CalendarView.OnCalendarSelectListener,
        CalendarView.OnYearChangeListener,
        CalendarView.OnMonthChangeListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onYearChange(int year) {

    }

    @Override
    public void onMonthChange(int year, int month) {

    }

    @Override
    public void onCalendarOutOfRange(Calendar calendar) {

    }

    @Override
    public void onCalendarSelect(Calendar calendar, boolean isClick) {

    }
}