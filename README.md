# DataBinding 

## The Data Binding Library is a support library that allows you to bind UI components in your layouts to data sources in your app using a declarative ## format rather than programmatically

# Steps 
## 1. Enable DataBinding in app level gradle file
```

    dataBinding{
        enabled = true
    }

```
## 2. wrap xml code in <layout></layout> tags 
```
<?xml version="1.0" encoding="utf-8"?>
<layout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools">

<androidx.constraintlayout.widget.ConstraintLayout
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <EditText
        android:id="@+id/et_name"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:textAlignment="center"
        android:layout_marginTop="272dp"
        android:hint="insert name here"
        app:layout_constraintTop_toTopOf="parent"
        tools:layout_editor_absoluteX="0dp" />

    <Button
        android:id="@+id/btn_submit"
        android:layout_width="100dp"
        android:layout_height="wrap_content"

        android:layout_marginTop="80dp"
        android:text="Submit"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.498"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/et_name" />

    <TextView
        android:id="@+id/textview"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        app:layout_constraintBottom_toTopOf="@+id/et_name"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />
</androidx.constraintlayout.widget.ConstraintLayout>
</layout>
```

## 3. create binding object
```  private lateinit var binding : ActivityMainBinding ```

## 4. replace setContent with binding object
```
 binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
```

