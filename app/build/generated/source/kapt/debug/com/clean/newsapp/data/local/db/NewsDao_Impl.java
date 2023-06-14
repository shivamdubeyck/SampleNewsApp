package com.clean.newsapp.data.local.db;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.EntityUpsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.clean.newsapp.data.local.entities.NewsItemEntity;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class NewsDao_Impl implements NewsDao {
  private final RoomDatabase __db;

  private final EntityUpsertionAdapter<NewsItemEntity> __upsertionAdapterOfNewsItemEntity;

  public NewsDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__upsertionAdapterOfNewsItemEntity = new EntityUpsertionAdapter<NewsItemEntity>(new EntityInsertionAdapter<NewsItemEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT INTO `newsItem` (`id`,`author`,`content`,`description`,`title`,`url`,`urlToImage`,`publishedAt`) VALUES (?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, NewsItemEntity value) {
        stmt.bindLong(1, value.getId());
        if (value.getAuthor() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getAuthor());
        }
        if (value.getContent() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getContent());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getDescription());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getTitle());
        }
        if (value.getUrl() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getUrl());
        }
        if (value.getUrlToImage() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getUrlToImage());
        }
        if (value.getPublishedAt() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getPublishedAt());
        }
      }
    }, new EntityDeletionOrUpdateAdapter<NewsItemEntity>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE `newsItem` SET `id` = ?,`author` = ?,`content` = ?,`description` = ?,`title` = ?,`url` = ?,`urlToImage` = ?,`publishedAt` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, NewsItemEntity value) {
        stmt.bindLong(1, value.getId());
        if (value.getAuthor() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getAuthor());
        }
        if (value.getContent() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getContent());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getDescription());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getTitle());
        }
        if (value.getUrl() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getUrl());
        }
        if (value.getUrlToImage() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getUrlToImage());
        }
        if (value.getPublishedAt() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getPublishedAt());
        }
        stmt.bindLong(9, value.getId());
      }
    });
  }

  @Override
  public Object upsertNewsFeed(final List<NewsItemEntity> entities,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __upsertionAdapterOfNewsItemEntity.upsert(entities);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public List<NewsItemEntity> getNewsFeed() {
    final String _sql = "SELECT * FROM newsItem";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfAuthor = CursorUtil.getColumnIndexOrThrow(_cursor, "author");
      final int _cursorIndexOfContent = CursorUtil.getColumnIndexOrThrow(_cursor, "content");
      final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
      final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
      final int _cursorIndexOfUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "url");
      final int _cursorIndexOfUrlToImage = CursorUtil.getColumnIndexOrThrow(_cursor, "urlToImage");
      final int _cursorIndexOfPublishedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "publishedAt");
      final List<NewsItemEntity> _result = new ArrayList<NewsItemEntity>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final NewsItemEntity _item;
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        final String _tmpAuthor;
        if (_cursor.isNull(_cursorIndexOfAuthor)) {
          _tmpAuthor = null;
        } else {
          _tmpAuthor = _cursor.getString(_cursorIndexOfAuthor);
        }
        final String _tmpContent;
        if (_cursor.isNull(_cursorIndexOfContent)) {
          _tmpContent = null;
        } else {
          _tmpContent = _cursor.getString(_cursorIndexOfContent);
        }
        final String _tmpDescription;
        if (_cursor.isNull(_cursorIndexOfDescription)) {
          _tmpDescription = null;
        } else {
          _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
        }
        final String _tmpTitle;
        if (_cursor.isNull(_cursorIndexOfTitle)) {
          _tmpTitle = null;
        } else {
          _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        }
        final String _tmpUrl;
        if (_cursor.isNull(_cursorIndexOfUrl)) {
          _tmpUrl = null;
        } else {
          _tmpUrl = _cursor.getString(_cursorIndexOfUrl);
        }
        final String _tmpUrlToImage;
        if (_cursor.isNull(_cursorIndexOfUrlToImage)) {
          _tmpUrlToImage = null;
        } else {
          _tmpUrlToImage = _cursor.getString(_cursorIndexOfUrlToImage);
        }
        final String _tmpPublishedAt;
        if (_cursor.isNull(_cursorIndexOfPublishedAt)) {
          _tmpPublishedAt = null;
        } else {
          _tmpPublishedAt = _cursor.getString(_cursorIndexOfPublishedAt);
        }
        _item = new NewsItemEntity(_tmpId,_tmpAuthor,_tmpContent,_tmpDescription,_tmpTitle,_tmpUrl,_tmpUrlToImage,_tmpPublishedAt);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public NewsItemEntity getNewsItemById(final int id) {
    final String _sql = "SELECT * FROM newsItem where id=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfAuthor = CursorUtil.getColumnIndexOrThrow(_cursor, "author");
      final int _cursorIndexOfContent = CursorUtil.getColumnIndexOrThrow(_cursor, "content");
      final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
      final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
      final int _cursorIndexOfUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "url");
      final int _cursorIndexOfUrlToImage = CursorUtil.getColumnIndexOrThrow(_cursor, "urlToImage");
      final int _cursorIndexOfPublishedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "publishedAt");
      final NewsItemEntity _result;
      if(_cursor.moveToFirst()) {
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        final String _tmpAuthor;
        if (_cursor.isNull(_cursorIndexOfAuthor)) {
          _tmpAuthor = null;
        } else {
          _tmpAuthor = _cursor.getString(_cursorIndexOfAuthor);
        }
        final String _tmpContent;
        if (_cursor.isNull(_cursorIndexOfContent)) {
          _tmpContent = null;
        } else {
          _tmpContent = _cursor.getString(_cursorIndexOfContent);
        }
        final String _tmpDescription;
        if (_cursor.isNull(_cursorIndexOfDescription)) {
          _tmpDescription = null;
        } else {
          _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
        }
        final String _tmpTitle;
        if (_cursor.isNull(_cursorIndexOfTitle)) {
          _tmpTitle = null;
        } else {
          _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        }
        final String _tmpUrl;
        if (_cursor.isNull(_cursorIndexOfUrl)) {
          _tmpUrl = null;
        } else {
          _tmpUrl = _cursor.getString(_cursorIndexOfUrl);
        }
        final String _tmpUrlToImage;
        if (_cursor.isNull(_cursorIndexOfUrlToImage)) {
          _tmpUrlToImage = null;
        } else {
          _tmpUrlToImage = _cursor.getString(_cursorIndexOfUrlToImage);
        }
        final String _tmpPublishedAt;
        if (_cursor.isNull(_cursorIndexOfPublishedAt)) {
          _tmpPublishedAt = null;
        } else {
          _tmpPublishedAt = _cursor.getString(_cursorIndexOfPublishedAt);
        }
        _result = new NewsItemEntity(_tmpId,_tmpAuthor,_tmpContent,_tmpDescription,_tmpTitle,_tmpUrl,_tmpUrlToImage,_tmpPublishedAt);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public Object isCachedFeedAvailable(final Continuation<? super Boolean> continuation) {
    final String _sql = "SELECT (SELECT COUNT(*) FROM newsItem) != 0";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<Boolean>() {
      @Override
      public Boolean call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final Boolean _result;
          if(_cursor.moveToFirst()) {
            final Integer _tmp;
            if (_cursor.isNull(0)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getInt(0);
            }
            _result = _tmp == null ? null : _tmp != 0;
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, continuation);
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
