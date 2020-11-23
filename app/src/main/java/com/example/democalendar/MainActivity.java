package com.example.democalendar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.haibin.calendarview.base.activity.BaseActivity;
import com.haibin.calendarview.library.Calendar;
import com.haibin.calendarview.library.CalendarLayout;
import com.haibin.calendarview.library.CalendarView;
import com.haibin.calendarview.range.RangeActivity;

public class MainActivity extends BaseActivity implements CalendarView.OnCalendarSelectListener, CalendarView.OnYearChangeListener, CalendarView.OnMonthChangeListener{

    CalendarView mCalendarView;
    TextView mTextMonthDay,mTvYear;
    CalendarLayout mCalendarLayout;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
        mCalendarView = findViewById(R.id.calendarView);
        mTextMonthDay = findViewById(R.id.tv_month_day);
        mCalendarLayout = findViewById(R.id.calendarLayout);
        mTvYear = findViewById(R.id.tv_year);

        mTvYear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(MainActivity.this, RangeActivity.class);
                startActivity(it);
            }
        });


        mCalendarView.setOnCalendarSelectListener(this);
        mCalendarView.setOnYearChangeListener(this);
        mCalendarView.setOnMonthChangeListener(this);

        mTextMonthDay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!mCalendarLayout.isExpand()) {
                    mCalendarLayout.expand();
                    return;
                }
                mCalendarView.showYearSelectLayout(mCalendarView.getCurYear());
                mTextMonthDay.setText(String.valueOf(mCalendarView.getCurYear()));
            }
        });
    }

    @Override
    protected void initData() {

    }


    @Override
    public void onYearChange(int year) {
        mTvYear.setText(String.valueOf(year));

    }
    @Override
    public void onMonthChange(int year, int month) {
        mTvYear.setText(String.valueOf(year));
        mTextMonthDay.setText(String.valueOf(month));
    }
    @Override
    public void onCalendarOutOfRange(Calendar calendar) {

    }
    @Override
    public void onCalendarSelect(Calendar calendar, boolean isClick) {

    }
}